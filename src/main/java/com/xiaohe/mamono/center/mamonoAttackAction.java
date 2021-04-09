package com.xiaohe.mamono.center;

import com.xiaohe.mamono.entity.Mono;
import com.xiaohe.mamono.util.MonoUtil;
import com.xiaohe.mamono.util.RandomUtil;

public class mamonoAttackAction {

    /**
     * 根据discoverer和target的国家，概率随机discoverer对target发起攻击
     * @param discoverer 发现着
     * @param target 被发现着
     * @return true为discoverer向target发起攻击
     */
    public boolean countryInAttack(Mono discoverer, Mono  target) {
        //不为同一个国家则发动攻击
        return !MonoUtil.isSomeProperties("country",discoverer,target);
    }

    /**
     * 根据discoverer和target的种族，概率随机discoverer对target发起攻击
     * @param discoverer 发现着
     * @param target 被发现着
     * @return true为discoverer向target发起攻击
     */
    public boolean raceInAttack(Mono discoverer, Mono  target){
        //不为同一个国家则发动攻击
        return !MonoUtil.isSomeProperties("race",discoverer,target);
    }

    /**
     * 根据discoverer和target的当前血量，概率随机discoverer对target发起攻击
     * @param discoverer 发现着
     * @param target 被发现着
     * @return
     */
    public boolean bloodHealthInAttack(Mono discoverer, Mono  target){
        //当目标血量低于自己则发动攻击
        if(target.getHp() < discoverer.getHp())
            return true;
        //当自己血量越低发动攻击的概率越低
        int hp = Integer.parseInt(discoverer.getHp()/discoverer.getMaxHp()*100 + "");
        return RandomUtil.probability(hp);
    }

    /**
     * 根据discoverer和target的等级，概率随机discoverer对target发起攻击
     * @param discoverer
     * @param target
     * @return
     */
    public boolean lvInAttack(Mono discoverer, Mono  target){
        if(target.getLv() < discoverer.getLv()){
            return true;
        }else{
            //target和discoverer等级发动攻击则为百分之50，target每高一级discoverer发动攻击的概率降低百分之5
            return RandomUtil.probability(50 - (target.getLv()-discoverer.getLv()) * 5);
        }

    }

}
