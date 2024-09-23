public class Polynomial {
	private double[] coefficients;
	  public Polynomial() {
	      this.coefficients = new double[] {0};
	  }
	  public Polynomial(double[] coefficients) {
	      this.coefficients = coefficients;
	  }
	  public Polynomial add(Polynomial that) {
		  int len1 = this.coefficients.length;
		  int len2 = that.coefficients.length;
		  int maxlen = Math.max(len1, len2);
		  double[] newcoefficients = new double[maxlen];
		  for (int i = 0; i < len1; i++) {
			  newcoefficients[i] +=  this.coefficients[i];
		  }
		  for (int i = 0; i < len2; i++) {
			  newcoefficients[i] +=  that.coefficients[i];
		  }
		  return new Polynomial(newcoefficients);
	  }
	  public double evaluate(double x) {
	      double result = 0.0;
	      for (int i = 0; i < this.coefficients.length; i++) {
	          result += this.coefficients[i] * Math.pow(x, i);
	      }
	      return result;
	  }
	  public boolean hasRoot(double x) {
	      return this.evaluate(x) == 0.0;
	  }
}