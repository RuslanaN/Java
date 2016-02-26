public class Complex implements Cloneable {
        private double real;
        private double imaginary;

        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary  = imaginary;
        }

        public Complex() {
            this(0.0, 0.0);
        }

        public double getReal() {
            return real;
        }

        public double getImaginary() {
            return imaginary;
        }

        public boolean equals(Complex other) {
            return real == other.real && imaginary == other.imaginary;
        }

        public Complex sum(Complex other) {
            return new Complex(real + other.real, imaginary + other.imaginary);
        }

        public Complex diff(Complex other) {
            return new Complex(real - other.real, imaginary - other.imaginary);
        }

        public Complex prod(Complex other) {
            return new Complex(real * other.real - imaginary * other.imaginary, real * other.imaginary + other.real * imaginary);
        }

        public String toString() {
            if ( imaginary >= 0 ) {
                return "(" + real + "+" + imaginary + "i)";
            } else {
                return "(" + real + imaginary + "i)";
            }
        }

        public Complex clone() throws CloneNotSupportedException {
            return (Complex) super.clone();
    }
}
