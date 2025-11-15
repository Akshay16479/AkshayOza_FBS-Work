package abstraction;

 class datee {
	
//toString wala code
	
		int day, month, year;
		String dow;

		datee(int day, int month, int year, String dow) {
			this.day = day;
			this.month = month;
			this.year = year;
			this.dow = dow;
		}

		int getDay() {
			return day;
		}

		void setDay(int day) {
			this.day = day;
		}

		int getMonth() {
			return month;
		}

		void setMonth(int month) {
			this.month = month;
		}

		int getYear() {
			return year;
		}

		void setYear(int year) {
			this.year = year;
		}

		String getDow() {
			return dow;
		}

		void setDow(String dow) {
			this.dow = dow;
		}

		public String toString() {
			return "Date is " + this.day + "/" + this.month + "/" + this.year + "/"  + this.dow ;
		}
	}

	class testdate {
		public static void main(String[] args) {
			datee d1 = new datee(14, 11, 2025, "Friday");
			datee d2 = new datee(25, 12, 2025, "Thursday");

			System.out.println(d1);
			System.out.println(d2);
		}
	}

