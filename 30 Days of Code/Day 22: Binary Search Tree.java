static int maxLen;
public static int getHeight(Node root){
        if (root == null)
            return 0;
      
        maxLen = 0;
      
        // maximum length root to leaf path
        longRootToLeafPath(root, 0);
      
        // required maximum length
        return maxLen-1;
    }
public static void longRootToLeafPath(Node root, int len)
    {
        
        if (root == null) {
            if (maxLen < len) {
                maxLen = len; 
            }
            return;
        }
        
        longRootToLeafPath(root.left, len + 1);
         
        longRootToLeafPath(root.right, len + 1);
         
    }
