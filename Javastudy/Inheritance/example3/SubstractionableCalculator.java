package Inheritance.example3;

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        super(left, right);
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}