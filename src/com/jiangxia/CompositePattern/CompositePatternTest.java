package com.jiangxia.CompositePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/18/21:43
 * @Description:
 */
public class CompositePatternTest {
    public static void main(final String[] args)    {
        final FolderComponent leaf = new FileLeaf("叶子文件");
        leaf.display();

        final FolderComponent folder = new FolderComposite("文件夹一");
        folder.add(new FileLeaf("文件夹里面的文件二"));
        folder.add(new FileLeaf("文件夹里面的文件三"));
        folder.display();
    }
}