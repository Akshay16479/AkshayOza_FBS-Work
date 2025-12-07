package practiceworkjava;

public class AdmissionForm {

    String studentName;
    int age;
    double percentage;
    double courseFees;
    double feesPaid;

    void validateForm() throws EmptyNameException,UnderageException,
            InvalidPercentageException,NotFitForAdmissionException,
            FeesNotPaidException, InsufficientFeesException {

        if (this.studentName.trim().isEmpty()) {
            throw new EmptyNameException();
        } else {
            System.out.println(this.studentName);
        }

        if (this.age < 17) {
            throw new UnderageException();
        } else {
            System.out.println(this.age);
        }

        if (this.percentage < 0 || this.percentage > 100) {
            throw new InvalidPercentageException();
        } else {
            System.out.println(this.percentage);
        }

        if (this.percentage < 35) {
            throw new NotFitForAdmissionException();
        } else {
            System.out.println(this.percentage);
        }

        if (this.feesPaid == 0) {
            throw new FeesNotPaidException();
        } else {
            System.out.println(this.feesPaid);
        }

        if (this.feesPaid < (0.30 * this.courseFees)) {
            throw new InsufficientFeesException();
        } else {
            System.out.println(this.feesPaid);
        }
    }
}
 


 class testAdmission {

    public static void main(String[] args) {

        AdmissionForm s1 = new AdmissionForm();

        s1.studentName = "Akshay";
        s1.age = 22;
        s1.percentage = 85;
        s1.courseFees = 800.0;
        s1.feesPaid = 500.0;

        try {
            s1.validateForm();
        } catch (EmptyNameException e) {
            System.out.println(e);
        } catch (UnderageException e) {
            System.out.println(e);
        } catch (InvalidPercentageException e) {
            System.out.println(e);
        } catch (NotFitForAdmissionException e) {
            System.out.println(e);
        } catch (FeesNotPaidException e) {
            System.out.println(e);
        } catch (InsufficientFeesException e) {
            System.out.println(e);
        }
    }
}


        
        
