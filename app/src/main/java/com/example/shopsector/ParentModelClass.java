package com.example.shopsector;

import java.util.List;

public class ParentModelClass {
    String rowTitle;
    List<ChildModelClass> childModelClassList;

    public ParentModelClass(String rowTitle, List<ChildModelClass> childModelClassList) {
        this.rowTitle = rowTitle;
        this.childModelClassList = childModelClassList;
    }
}
