package trenirovka4;

public class Rectangle {
        int width;
        int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;

        }

        public int getArea() {
            return this.width * this.height;
        }

        public int getPerimeter() {
            return (this.width +this.height) * 2;
        }
}
