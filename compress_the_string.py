from itertools import groupby


s = input()
for key, group in groupby(s):
    print(f"({len(list(group))}, {key})",end=' ')
