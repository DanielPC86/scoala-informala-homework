package calculator;

public class Calculator {
    private Integer a;
    private Integer b;
    private Integer c;

    public Calculator() {
    }

    public Calculator(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer getA() {
        return this.a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return this.b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return this.c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getMax() {
        if (this.a == null) {
            this.a = -2147483648;
        }

        if (this.b == null) {
            this.b = -2147483648;
        }

        if (this.c == null) {
            this.c = -2147483648;
        }

        int max1 = Math.max(this.a, this.b);
        int max2 = Math.max(max1, this.c);
        return max2;
    }

    public Integer getMin() {
        if (this.a == null) {
            this.a = 2147483647;
        }

        if (this.b == null) {
            this.b = 2147483647;
        }

        if (this.c == null) {
            this.c = 2147483647;
        }

        int min1 = Math.min(this.a, this.b);
        int min2 = Math.min(min1, this.c);
        return min2;
    }

    public Integer getSum() {
        if (this.a == null) {
            this.a = 0;
        }

        if (this.b == null) {
            this.b = 0;
        }

        if (this.c == null) {
            this.c = 0;
        }

        int sum = this.a + this.b + this.c;
        return sum;
    }

    public Double getAvg() {
        if (this.a == null) {
            this.a = 0;
        }

        if (this.b == null) {
            this.b = 0;
        }

        if (this.c == null) {
            this.c = 0;
        }

        double avg = (double)((this.a + this.b + this.c) / 3);
        return avg;
    }

    public Boolean areAllPositive() {
        if (this.a == null) {
            this.a = 0;
        }

        if (this.b == null) {
            this.b = 0;
        }

        if (this.c == null) {
            this.c = 0;
        }

        return this.a > 0 && this.b > 0 && this.c > 0 ? true : false;
    }

    public Boolean isAEven() {
        return this.a % 2 == 0 ? true : false;
    }
}
