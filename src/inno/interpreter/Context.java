package inno.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private String content;
    private List<Expression> list = new ArrayList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void add(Expression eps){
        list.add(eps);
    }

    public List<Expression> getList(){
        return list;

    }}
