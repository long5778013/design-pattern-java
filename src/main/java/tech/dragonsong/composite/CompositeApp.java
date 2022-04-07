package tech.dragonsong.composite;

import java.util.stream.IntStream;

public class CompositeApp {

    // 创建一个有部门、有员工的组织节点数
    public static void main(String[] args) {
        // 假设我们的组织数有102个
        // 2个部门，分别有一堆个员工
        Department dep1 = new Department();
        dep1.id=1;
        Department dep2 = new Department();
        dep1.id=2;

        fillDepartment(dep1,3,53);
        fillDepartment(dep2,53,104);

        System.out.println("部门一的节点数："+dep1.getOrgCount());
        System.out.println("部门二的节点数："+dep2.getOrgCount());
    }

    private static void fillDepartment(Department department,int startInclusive,int endExclusive) {
        IntStream.range(startInclusive,endExclusive).forEach(i->{
            Employee employee = new Employee();
            employee.id=i;
            department.addSub(employee);
        });
    }
}
