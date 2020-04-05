package dao;

import common.JavaImageServerException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImageDao {
    //把Image操作插入到数据库中
    public void insert(Image image){
        //1.获取数据库连接
        Connection connection = DBUtil.getConnection();
        //2.创建并拼装sql语句
        String sql = "insert into image_table values(null,?,?,?,?,?,?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1,image.getImageName());
            statement.setInt(2,image.getSize());
            statement.setString(3,image.getUploadTime());
            statement.setString(4,image.getContentType());
            statement.setString(5,image.getPath());
            statement.setString(6,image.getMd5());

            //3.执行sql语句
            int ret = statement.executeUpdate();
            if(ret != 1){
                //出现问题，抛出一个异常
                //自定义一个异常类JavaimageServerException
                throw  new JavaImageServerException("插入数据库出错");
            }
        } catch (SQLException | JavaImageServerException e) {
            e.printStackTrace();
        }
//         catch (JavaImageServerException e) {
//            e.printStackTrace();
//        }
        //4.关闭连接和statement对象
        finally {
            DBUtil.close(connection,statement,null);
        }
    }
    //查找数据库中所有图片的信息
    public List<Image> selectAll(){
        List<Image> list = new ArrayList<>();
        ResultSet resultSet = null;
        //1.获取数据库连接
        Connection connection = DBUtil.getConnection();
        //2.构造sql语句
        String sql = "select * from image_table";
        PreparedStatement statement = null;
        //3.执行SQL语句
        try{
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            //4.处理结果集
            while(resultSet.next()){
                Image image = new Image();
                image.setImageId(resultSet.getInt("imageId"));
                image.setImageName(resultSet.getString("imageName"));
                image.setSize(resultSet.getInt("size"));
                image.setUploadTime(resultSet.getString("uploadTime"));
                image.setPath(resultSet.getString("path"));
                image.setMd5(resultSet.getString("md5"));
                list.add(image);
            }
            return list;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //5.关闭连接
            DBUtil.close(connection,statement,resultSet);
        }

        return null;
    }

    public static void main(String[] args) {
//        Image image = new Image();
//        image.setImageName("1.png");
//        image.setSize(100);
//        image.setUploadTime("20200405");
//        image.setContentType("image/png");
//        image.setPath("D:\\picture");
//        image.setMd5("11223344");
//
//        ImageDao imageDao = new ImageDao();
//        imageDao.insert(image);

        ImageDao imageDao = new ImageDao();
        List<Image> list = imageDao.selectAll();
        System.out.println(list);
    }
}
