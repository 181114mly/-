package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.servlet.http.HttpServletRequest;

@Getter
@Setter
@ToString
public class Page {
    private String searchText;//搜索的内容
    private String sortOrder;//排序：升序？降序
    private Integer pageSize;//每页数量
    private Integer pageNumber;//当前的页码起始位置
/**
 * request 输入流只能获得请求体中的数据
 * request.getParameter()可以获得url和请求体中的数据，数据格式为：k1=v1&k2=v2...
 */
    public static Page parse(HttpServletRequest req){
        Page p=new Page();
        p.searchText=req.getParameter("searchText");
        p.sortOrder=req.getParameter("sortOrder");
        p.pageSize=Integer.parseInt(req.getParameter("pageSize"));
        p.pageNumber=Integer.parseInt(req.getParameter("pageNumber"));
        return p;
    }

}
