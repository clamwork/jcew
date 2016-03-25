package cn.com.jandar.dao;

import java.util.List;

import cn.com.jandar.model.Department;
import cn.com.jandar.model.Manufacturer;
import cn.com.jandar.model.Point;

public interface IPointDao {
	
	public List<Point> getByManufacture(Manufacturer manufacture);// 根据工程商获取点位
	
	public List<Point> getByDepartment(Department department);//根据责任部门回去点位
	
	public List<Point> getAllPoints();//获取所有点位
	
	public List<Point> getAllUsingPoints();//获取所有使用中的点位（包括检修）

}
