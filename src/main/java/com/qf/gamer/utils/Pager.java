package com.qf.gamer.utils;

import java.util.List;

public class Pager<T> {
    private List<T> pageData;
    /**
     * 当前页
     */
    private int currentPage = 1;
    /**
     * 默认页码数
     */
    private int pageSize = 10;
    /**
     * 数据库总条数
     */
    private int totalCount;

    int getPageCount() {
        if (this.totalCount % this.pageSize == 0) {
            return this.totalCount / this.pageSize;
        }
        return this.totalCount / this.pageSize + 1;
    }

    public Pager(List<T> pageData, Integer totalCount) {
        this.pageData = pageData;
        this.totalCount = totalCount;
    }

    public Pager() {
    }

    public boolean isFirst() {
        return (this.currentPage == 1) || (this.totalCount == 0);
    }

    /**
     * 是否是最后一页
     *
     * @return
     */
    public boolean isLast() {
        return (this.totalCount == 0) || (this.currentPage >= getPageCount());
    }

    /**
     * 是否有下一页
     *
     * @return
     */
    public boolean isHasNext() {
        return this.currentPage < getPageCount();
    }

    /**
     * 是否有上一页
     *
     * @return
     */
    public boolean isHasPrev() {
        return this.currentPage > 1;
    }

    /**
     * 获取下一页
     *
     * @return
     */
    public Integer getNextPage() {
        if (this.currentPage >= getPageCount()) {
            return getPageCount();
        }
        return this.currentPage + 1;
    }

    /**
     * 获取当前页码
     *
     * @return
     */
    public Integer getPrevPage() {
        return this.currentPage <= 1 ? 1 : this.currentPage - 1;
    }

    /**
     * 获取数据
     *
     * @return
     */
    public List<T> getPageData() {
        return this.pageData;
    }

    /**
     * 设置数据
     *
     * @param pageData
     */
    public void setPageData(List<T> pageData) {
        this.pageData = pageData;
    }

    /**
     * 获取当前页码
     *
     * @return
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * 设置当前页
     *
     * @param currentPage
     */
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * 获取当前每页多少条
     *
     * @return
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 总条数
     *
     * @return
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
