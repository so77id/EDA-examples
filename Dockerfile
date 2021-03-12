FROM java:8-jdk-alpine

RUN apk update && apk add git zsh curl

RUN sh -c "$(curl -fsSL https://raw.github.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"

CMD ["/bin/zsh"]
