INHERIT += "extrausers"
EXTRA_USERS_PARAMS += " \
usermod -p toor root; \
usermod -s /bin/busybox root; \
"

