package com.jiangxia.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 江夏
 * @Date: 2021/11/18/21:43
 * @Description:
 */
public class FolderComposite extends FolderComponent {
    private final List<FolderComponent> components;

    public FolderComposite(final String name) {
        super(name);
        this.components = new ArrayList<FolderComponent>();
    }

    public FolderComposite() {
        this.components = new ArrayList<FolderComponent>();
    }

    @Override
    public void add(final FolderComponent component) {
        this.components.add(component);
    }

    @Override
    public void remove(final FolderComponent component) {
        this.components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("文件夹组合容器的名字是" + this.getName());
        for (final FolderComponent component : components) {
            System.out.println("文件夹组合容器的当前文件夹是" + component.getName());
        }
    }
}
