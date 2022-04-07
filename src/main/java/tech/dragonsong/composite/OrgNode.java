package tech.dragonsong.composite;

/**
 * 组织节点
 */
public abstract class OrgNode {

    /**
     * 编号
     */
    protected Integer id;

    /**
     * 组织节点数量
     */
    protected Long orgCount;

    /**
     * @return 获取当前组织节点以及下级的数量
     */
    abstract Long getOrgCount();
}
