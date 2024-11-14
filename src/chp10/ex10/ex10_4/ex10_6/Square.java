package chp10.ex10.ex10_4.ex10_6;

    public class Square extends Shape{
        private int width;

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        @Override
        double area() {
            double result = Math.pow(width,2);
            return result;
        }
    }



