#include <stdio.h>  
#include <string.h>  
#include <stdlib.h>  
  
int lns(char *str){  
    int length, max = 1, temp;  
    int i, j;  
    int a[26];  
    length = strlen(str);  
    i = 0;  
    while(i < 26)  
        a[i++] = 0;  
    a[str[0] - 'a'] = 1;  
    i = 0;  
    j = 1;  
    temp = 1;  
    while((j < length) && (i < length - max)){  
        if(a[str[j] - 'a'] == 0){  
            a[str[j] - 'a'] = 1;  
            temp++;  
            if(max < temp)  
                max = temp;  
            j++;  
        }  
        else{  
            a[str[i] - 'a'] = 0;  
            i++;  
            temp--;  
        }  
    }  
    return max;  
}  
  
int main(){  
     
    //char str[]="abcabcbb";//第一次提交，纯字母  
    //char str[]="1231231122abc";//第二次提交 ，字母数字组合 
    //char str[]="aabbAABBabbbbABBBB";//第三次提交，字母大小写 
    //char str[]="aabbAABB@@##$!@@##$!";//第四次提交，特殊字符 
    char str[1024];  
    scanf("%s", str); //第五次提交，手动输入 
    printf("该字符串内最长不重复的子串长度为: %d\n", lns(str));  
    system("pause");  
    return 0;     
} 
