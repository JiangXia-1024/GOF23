package com.jiangxia.CompositePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/18/21:41
 * @Description:
 */
public class FileLeaf  extends FolderComponent{
    public FileLeaf(final String name) {
        super(name);
    }

    @Override
    public void add(FolderComponent component) {
    }

    @Override
    public void remove(FolderComponent component) {
    }

    @Override
    public void display() {
        System.out.println("叶子文件:" + this.getName());
    }
}
