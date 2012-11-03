
public class LineImp extends Line{
	
	private double slope;
	private double intercept;
	
	@Override
	public double getSlope() {
		// TODO Auto-generated method stub
		return slope;
		
	}

	@Override
	public void setSlope(double newSlope) {
		// TODO Auto-generated method stub
		slope = newSlope;
		
	}

	@Override
	public double getIntercept() {
		// TODO Auto-generated method stub
		return intercept;
	}

	@Override
	public void setIntercept(double newSlope) {
		// TODO Auto-generated method stub
		intercept = newSlope;
	}

	@Override
	public void derive(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		if ((x2-x1) == 0)
		{
			throw new IllegalArgumentException("Cannot divide by 0");
		}
		if ((x2-x1) != 0)
		{
		slope = (y2-y1)/(x2-x1);
		intercept = y2-slope*x2;
		}
	}

}
