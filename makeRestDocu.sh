#!/bin/sh
# https://tinyapps.org/blog/201701240700_convert_asciidoc_to_markdown.html
asciidoc -b docbook restDocu.adoc
pandoc -f docbook -t markdown_strict restDocu.xml -o restDocu.md
sed -i "s/>[ ]*//g" restDocu.md
sed -i "s/\*\([^\*]\+\)\*\([^\*]\)/'\1'\2/g" restDocu.md
