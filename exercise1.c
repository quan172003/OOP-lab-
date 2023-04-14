#include<stdio.h>
#include<stdlib.h>
#include<string.h>

char doi(char kt, int n){//Ham doi ki tu
    int i = 0;
    char a[26], A[26];
    char kq;

    a[0] = 'a';
    A[0] = 'A';
    for(i = 0; i < 26; i++)
    {
      a[i] = a[0] + i;
      A[i] = A[0] + i; 
    }

    for(i = 0; i < 26; i++)
    {
        if(kt == a[i])
        {
            if((i + 1) > (26 - n))
            {
                kq = a[i+ 1 + n - 26];
                return kq;
            }
            else
            {
                kq = a[i + n];
                return kq;
            }
        }
        else if(kt == A[i])
        {
            if((i + 1) > (26 - n))
            {
                kq = A[i +1 + n - 26];
                return kq;
            }
            else
            {
                kq = A[i + n];
                return kq;
            }
        }
        else
        {
            continue;
        }
    }
    return kt;
}

typedef struct{
    char kq[100];
}final;

int main(int argc, char *argv[]){
    FILE *f1, *f2;
    int n;
    char name[]= "exercise1.txt";
    final c[100];

    if(argc != 3)//Loi argument
    {
        printf("Error Syntax\nCorrect Syntax : <Namefile><Jump>\n");
        return 1;
    }

    n = atol(argv[2]);

    f1 = fopen(argv[1], "r");
    f2 = fopen(name, "w");

    if(f1 == NULL)//Loi file
    {
        printf("the file is not exist\n");
    }


    char kt[100];
    int j = 0;

    while( fscanf(f1, "%s", kt) != EOF){//Nhap xuat tu
        int i = 0;
        char kq[100];
        while(kt[i] != '\0')
        {
            c[j].kq[i] = doi(kt[i], n);
            i++;
        }
            fprintf(f2, "%s ", c[j].kq);
            j++;

    }
    
    return 0;

    


}