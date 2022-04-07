package tech.dragonsong.composite;

/**
 * 员工是一个组织节点
 */
public class Employee extends OrgNode {


    @Override
    Long getOrgCount() {
        return 1L;
    }
}
