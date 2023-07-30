package chat.infrastructure.common;

import org.apache.commons.lang3.StringUtils;

/**
 * 页数返回结果
 * @author asus
 */
public class PageReq {
    /**
     *  开始 limit 第一个参数
     */
    private int pageStart = 0;

    /**
     * 结束 limit 第二个参数
     */
    private int pageEnd = 0;

    /**
     * 页数
     */
    private int page;

    /**
     * 行数
     */
    private int rows;

    public PageReq() {
    }

    public PageReq(String page, String rows) {
        this.page = StringUtils.isEmpty(page) ? 1 : Integer.parseInt(page);
        this.rows = StringUtils.isEmpty(page) ? 10 : Integer.parseInt(rows);
        if (0 == this.page) {
            this.page = 1;
        }
        this.pageStart = (this.page - 1) * this.rows;
        this.pageEnd = this.rows;
    }

    public void setPage(String page, String rows) {
        this.page = StringUtils.isEmpty(page) ? 1 : Integer.parseInt(page);
        this.rows = StringUtils.isEmpty(page) ? 10 : Integer.parseInt(rows);
        if (0 == this.page) {
            this.page = 1;
        }
        this.pageStart = (this.page - 1) * this.rows;
        this.pageEnd = this.rows;
    }

    public int getPageStart() {
        return pageStart;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public int getPageEnd() {
        return pageEnd;
    }

    public void setPageEnd(int pageEnd) {
        this.pageEnd = pageEnd;
    }

}
