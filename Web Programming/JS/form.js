
        function validateForm() {

             username = document.getElementById("username").value.trim();
             password = document.getElementById("password").value;
             email    = document.getElementById("email").value.trim();
             mobno    = document.getElementById("mobno").value.trim();
             gender   = document.querySelector('input[name="gender"]:checked');
             subjects = document.querySelectorAll('input[name="subject"]:checked');
             state    = document.getElementById("state").value;

            if (username == "") {
                alert("Username required");
                return false;
            }

            if (password.length < 15) {
                alert("Password must be at least 15 characters");
                return false;
            }

            if (email == "" || !email.includes("@") || !email.includes(".")) {
                alert("Enter valid email");
                return false;
            }
            
            if (mobno.length != 10) {
                alert("Mobile number must be 10 digits");
                return false;
            }

            for ( i = 0; i < mobno.length; i++) {
                if (mobno[i] < '0' || mobno[i] > '9') {
                    alert("Mobile number must contain only digits");
                    return false;
                }
            }

            if (gender == null) {
                alert("Select gender");
                return false;
            }

            if (subjects.length == 0) {
                alert("Select at least one subject");
                return false;
            }

            if (state == "") {
                alert("Select state");
                return false;
            }

            alert("Form submitted successfully!");
            return true;
        }
    