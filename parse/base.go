package parse

import "math/big"

type Podcast struct {
	id     int
	name   string
	author string
}

type Episode struct {
	id      string
	name    string
	podcast Podcast
	time    big.Int
}
