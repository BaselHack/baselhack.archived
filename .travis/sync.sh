eval "export pwd=\$pwd_$TRAVIS_BRANCH"
eval "export usr=\$usr_$TRAVIS_BRANCH"
rm -rf .git .travis
rm .travis.yml .gitignore
(
echo set ssl:verify-certificate false
echo set ftp:prefer-epsv false
echo open -u $usr,$pwd sl51.web.hostpoint.ch
echo mirror -v -c -e -R
echo exit
) | lftp -f /dev/stdin
