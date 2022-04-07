package tech.dragonsong.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门是一个组织节点
 */
public class Department extends OrgNode {

    private List<OrgNode> employeeList = new ArrayList<>();

    @Override
    Long getOrgCount() {
        if (null == employeeList || employeeList.isEmpty()) {
            return 1L;
        }
        return 1 + employeeList.stream()
                .map(OrgNode::getOrgCount)
                .reduce(Long::sum)
                .get();
    }

    public void addSub(OrgNode org) {
        employeeList.add(org);
    }
}
