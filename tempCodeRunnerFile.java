int search(int no){
        int first=0,last=data.length,mid;
        mid=first+last/2;
        while (first<last) {
            if(data[mid]==no){
                return mid;
            }
            else if(data[mid]<no){
                first=mid;
            }
            else if(data[mid]>no){
                last=mid;
            }
        }
        return 0;
    }