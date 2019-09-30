FROM golang:latest

WORKDIR /go/src/app
COPY app.go app.go

RUN go build app.go
#RUN go install -v ./...

CMD ["./app"]
