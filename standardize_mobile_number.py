def wrapper(f):
    def fun(l):
        for idx in range(len(l)):
            if l[idx].startswith("+91"):
                pass
            elif l[idx].startswith("91") and len(l[idx]) == 12:
                l[idx] = l[idx].replace("91", "+91", 1)
            elif l[idx].startswith('0') and len(l[idx]) < 13:
                l[idx] = l[idx].replace('0', "+91", 1)
            else:
                l[idx] = "+91" + l[idx]
            tmp = list(l[idx])
            tmp.insert(3, ' ')
            tmp.insert(9, ' ')
            l[idx] = "".join(tmp)
        l = sorted(l)
        return print(*l, sep='\n')
    return fun


@wrapper
def sort_phone(l):
    print(*sorted(l), sep='\n')


if __name__ == '__main__':
    l = [input() for _ in range(int(input()))]
    sort_phone(l)
