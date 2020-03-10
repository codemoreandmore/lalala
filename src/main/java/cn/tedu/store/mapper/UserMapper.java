package cn.tedu.store.mapper;
/**
 * 处理用户数据的持久层接口
 */
import java.util.Date;
import org.apache.ibatis.annotations.Param;
import cn.tedu.store.entity.User;

public interface UserMapper {
	
	/**
	 * 插入用户数据
	 * @param user 用户数据
	 * @return 受影响的行数，当输入成功时，可以从参数对象中获取自动递增的uid值
	 */
	Integer insert(User user);
	
	/**
	 * 根据用户的id更新用户基本信息
	 * @param user 封装了用户的id和新的信息的对象
	 * @return 受影响的行数
	 */
	Integer updateInfoByUid(User user);
	
	/**
	 * 修改用户密码
	 * @param uid 用户的id
	 * @param password 新密码
	 * @param modifiedUser 修改执行人
	 * @param modifiedTime 修改时间
	 * @return 受影响的行数
	 */
	Integer updatePasswordByUid(
			@Param("uid") Integer uid,
			@Param("password") String password,
			@Param("modifiedUser") String modifiedUser,
			@Param("modifiedTime") Date modifiedTime);
	
	/**
	 * 修改某用户的头像
	 * @param uid 用户id
	 * @param avatar 用户头像
	 * @param modifiedUser 创建人
	 * @param modifiedTime 创建时间
	 * @return
	 */
	Integer updateAvatarByUid(
			@Param("uid") Integer uid,
			@Param("avatar") String avatar,
			@Param("modifiedUser") String modifiedUser,
			@Param("modifiedTime") Date modifiedTime);
	
	/**
	 * 根据用户id查询用户数据详情
	 * @param uid 用户id
	 * @return 匹配的用户数据，如果没有匹配的数据，则返回null
	 */
	User findByUid(Integer uid);
	
	/**
	 * 根据用户名查询用户数据详情
	 * @param username 用户名
	 * @return 匹配的用户数据，如果没有匹配的数据，则返回null
	 */
	User findByUsername(String username);
	
	
	
}