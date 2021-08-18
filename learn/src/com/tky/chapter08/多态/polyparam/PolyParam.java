package com.tky.chapter08.多态.polyparam;

public class PolyParam {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager mary = new Manager("mary", 5000, 200000);
        PolyParam poly = new PolyParam();

        poly.showEmpAnnual(tom);
        poly.showEmpAnnual(mary);

        poly.testWork(tom);
        poly.testWork(mary);
    }

    /**
     * 获取任何员工对象的年工资
     * @param e
     */
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("类型错误，请检查类型");
        }
    }
}
