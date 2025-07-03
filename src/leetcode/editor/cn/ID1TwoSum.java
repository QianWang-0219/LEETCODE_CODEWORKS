package leetcode.editor.cn;  
import java.util.*; 
import leetcode.editor.util.*;
public class ID1TwoSum{ 	
    public static void main(String[] args) { 		
        Solution solution = new ID1TwoSum().new Solution(); 		
        StringBuilder sb = new StringBuilder(); 		 		
        
        //执行测试 		
         		
        System.out.println(sb);		 	
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num2index = new HashMap<>(); // num->index
        for (int i = 0; i < nums.length; i++) {
            // 判断之前的数字中是否有合适的选择
            int need = target - nums[i];
            if (num2index.containsKey(need)) {
                return new int[]{i, num2index.get(need)};
            }
            num2index.put(nums[i], i);
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
 
}