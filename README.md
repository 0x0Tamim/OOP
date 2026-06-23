Sample 2

#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main()
{
    int fd;

    char data[] =
    "Operating System Lab\n";

    fd = open("sample.txt",
              O_WRONLY | O_APPEND);

    if(fd < 0)
    {
        perror("Open failed");
        return 1;
    }

    write(fd,data,sizeof(data));

    printf("Data written.\n");

    close(fd);

    return 0;
}



Sample 3


#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main()
{
    int fd,n;

    char buffer[100];

    fd = open("sample.txt",
              O_RDONLY);

    if(fd < 0)
    {
        perror("Open failed");
        return 1;
    }

    n = read(fd,
             buffer,
             sizeof(buffer));

    write(1,buffer,n);

    close(fd);

    return 0;
}


Sample 4

#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main()
{
    int fd,n;

    char buffer[20];

    fd = open("sample.txt",
              O_RDONLY);

    lseek(fd,5,SEEK_SET);

    n = read(fd,
             buffer,
             sizeof(buffer));

    write(1,buffer,n);

    close(fd);

    return 0;
}