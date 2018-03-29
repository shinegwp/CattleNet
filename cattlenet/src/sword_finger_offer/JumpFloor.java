package sword_finger_offer;
/**
 * @time 18.3.29
 * @author 高伟鹏
 * @describe 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloor {
	/**
	 * @describe 错误的解题，思路完全错误，运用了概率，而没有进行递推
	 * @param target
	 * @return
	 */
//    public int jumpFloor(int target){
//		int time = target/2;
//		int denominator = target, numerator = 1;
//    	while(time > 0){
//			time--;
//			denominator *= (denominator - 1);
//			numerator *= (numerator + 1);
//		}
//    	return target*(target-1)/2 + 1;
//    }
	/**
	 * @describe 对于第i（i>2）个台阶,只有两周方式达到，通过第i-1个台阶或者i-2个台阶跳上去。这样就形成了一个fibonacci数列
	 * @param target
	 * @return
	 */
	public int jumpFloor(int target){
		int preNumber = 2, prePreNumber = 1,result = 0;
		if(target == 1){
			return 1;
		}else if (target == 2) {
			return 2;
		} else {
			while(target-->2){
				result = preNumber + prePreNumber;
				prePreNumber = preNumber;
				preNumber = result;
			}
			return result;
		}
	}
}
