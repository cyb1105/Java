package overriding.example1;

class SubstractionableCalculator extends Calculator {

    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}
