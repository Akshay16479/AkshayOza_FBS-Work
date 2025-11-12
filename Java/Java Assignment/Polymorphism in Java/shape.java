package inheritance;

 class Shape {
		String color;
	    int Borderwidth;
	    
//default
		Shape() {
			this.color = "Black";
			this.Borderwidth = 2;
		}

//parameterized		
		Shape(String color, int borderwidth) {
			super();
			this.color = color;
			Borderwidth = borderwidth;
		}
		
//setter-getter
		String getColor() {
			return color;
		}

		void setColor(String color) {
			this.color = color;
		}

		int getBorderwidth() {
			return Borderwidth;
		}

		void setBorderwidth(int borderwidth) {
			Borderwidth = borderwidth;
		}

//display		
		void display() {
			System.out.println("Shape color: " + this.color);
			System.out.println("Border Width: " + this.Borderwidth);
		}
	}
//class shape ends 
 
	class rectangle extends Shape {
		int length;
		int width;

//default		
		rectangle() {
			super();
			this.length = 5;
			this.width = 7;
		}

//parameterized		
		
		rectangle(String color, int borderwidth, int length, int width) {
			super(color, borderwidth);
			this.length = length;
			this.width = width;
		}

//setter-getter
		
		int getLength() {
			return length;
		}

		void setLength(int length) {
			this.length = length;
		}

		int getWidth() {
			return width;
		}

		void setWidth(int width) {
			this.width = width;
		}

		void display() {
			super.display();
			System.out.println("Length: " + this.length);
			System.out.println("Width: " + this.width);
		}
	}
//class rectangle ends
	class testShape {

		public static void main(String[] args) {

			Shape s1 = new Shape();
			s1.display();

			 s1 = new rectangle("white", 1, 5, 6);
			 s1.display();

		}

	}
//class ends here

