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
    char str[]="abcabc";  
    //scanf("%s", str);  
    printf("length of longest non-repete substring: %d\n", lns(str));  
    system("pause");  
    return 0;     
} 
