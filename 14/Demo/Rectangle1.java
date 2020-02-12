class Rectangle1 extends GeometricObject implements Comparable {
    private double width;
    private double height;

    public Rectangle1() {
        this(1.0,1.0);
    }

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return(this.width);
    }

    public double getHeight() {
        return(this.height);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return(this.width*this.height);
    }

    public double getPerimeter() {
        return(2*(this.width+this.height));
    }

    public int compareTo(Object obj) {
        if (this.getArea() > ((Rectangle1)obj).getArea()) {
            return 1;
        }
        else if (this.getArea() < ((Rectangle1)obj).getArea()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public boolean equals(Object obj) {
        return (this.getArea() == ((Rectangle1)obj).getArea());
    }
}
