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
     
    //char str[]="abcabcbb";//��һ���ύ������ĸ  
    //char str[]="1231231122abc";//�ڶ����ύ ����ĸ������� 
    //char str[]="aabbAABBabbbbABBBB";//�������ύ����ĸ��Сд 
    //char str[]="aabbAABB@@##$!@@##$!";//���Ĵ��ύ�������ַ� 
    char str[1024];  
    scanf("%s", str); //������ύ���ֶ����� 
    printf("���ַ���������ظ����Ӵ�����Ϊ: %d\n", lns(str));  
    system("pause");  
    return 0;     
} 
