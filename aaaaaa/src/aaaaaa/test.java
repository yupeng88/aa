package aaaaaa;

public class test {
    int pageIndex;// 当前页码
    int pageSize;// 每页条数
    int notNullCount;// 非空数据总数
    int notNullPageCount;// 非空的页数（含特殊页）
    int nullPageCount;// 空的页数
    int size;// 导出参数
    int pageEnd;// 导出的最后一页

    public void export() {
        pageEnd = pageIndex + size;
        if (pageEnd < notNullPageCount) {// 导出的数据都在非空范围内
            // 省略查询
        } else if (pageIndex > notNullPageCount) {// 导出数据都在null范围内
            // 省略查询语句
        } else if (pageIndex <= notNullPageCount && pageEnd >= notNullPageCount) {
            // 这里的数据可能包含非空和空两部分

            // 查询出非空的数据
            int pageNotNullBeginIndex = (pageIndex - 1) * pageSize + 1;
            int pageNotNullEndIndex = notNullCount;
            // 查询出空的数据
            int pageNullBeginIndex = notNullCount + 1;
            int pageNullEndIndex = pageEnd * pageSize;
        }
    }

}
