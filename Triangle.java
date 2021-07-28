public class Triangle{
	double base;
	double height;
	double sideLenOne;
	double sideLenTwo;
	double sideLenThree;
	
	public Triangle(double base, double height,
					double sideLenOne, double sideLenTwo,
					double sideLenThree){
		this.base = base;
		this.height = height;
		this.sideLenOne = sideLenOne;
		this.sideLenTwo = sideLenTwo;
		this.sideLenThree = sideLenThree;
		System.out.println("Inside Constructor");
	}
	public double findArea(){
		return this.base * this.height / 2;
	}
}
