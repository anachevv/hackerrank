s = input()
occs = dict(sorted({key: s.count(key) for key in s}.items(), key=lambda x: (-x[1], x[0])))
idx = 0
for key, value in occs.items():
    if idx == 3:
        break
    print(f"{key} {value}")
    idx += 1
