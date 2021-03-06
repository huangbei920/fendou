package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TConsumerMachine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 消费机 数据层
 * 
 * @author ruoyi
 * @date 2019-09-04
 */
public interface TConsumerMachineMapper 
{
	/**
     * 查询消费机信息
     * 
     * @param id 消费机ID
     * @return 消费机信息
     */
	public TConsumerMachine selectTConsumerMachineById(Integer id);
	
	/**
     * 查询消费机列表
     * 
     * @param tConsumerMachine 消费机信息
     * @return 消费机集合
     */
	public List<TConsumerMachine> selectTConsumerMachineList(TConsumerMachine tConsumerMachine);
	
	/**
     * 新增消费机
     * 
     * @param tConsumerMachine 消费机信息
     * @return 结果
     */
	public int insertTConsumerMachine(TConsumerMachine tConsumerMachine);
	
	/**
     * 修改消费机
     * 
     * @param tConsumerMachine 消费机信息
     * @return 结果
     */
	public int updateTConsumerMachine(TConsumerMachine tConsumerMachine);
	
	/**
     * 删除消费机
     * 
     * @param id 消费机ID
     * @return 结果
     */
	public int deleteTConsumerMachineById(Integer id);
	
	/**
     * 批量删除消费机
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTConsumerMachineByIds(String[] ids);

	/**
	 * 通过设备ID，查询设备信息
	 *
	 */
	public TConsumerMachine  selectTConsumerMachineByMachineId(@Param( "devId") String devId) ;
	
}