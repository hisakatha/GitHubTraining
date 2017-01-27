# GitHubTraining [![Build Status](https://travis-ci.org/hisakatha/GitHubTraining.svg?branch=master)](https://travis-ci.org/hisakatha/GitHubTraining)

( This is a test repository for GitHub training. )

This program calculates a sum (in default) or a product of integers in the command line arguments.

## Requirement

You need `sbt` or some program which can compile Scala code.

## Install and Usage

Fisrt,

```
git clone https://github.com/hisakatha/GitHubTraining [TARGET_DIRECTORY]
```

then move to TARGET_DIRECTORY, and

```
sbt "run [options] <integer>..."
```

### Options

`calc` is a temporal name of this program.

```
calc 1.0
Usage: calc [options] <integer>...

  -m, --multiply  Return a product instead of a sum.
  <integer>...    Integers to be calculated.
  --help          Print this help text
  --version       
Return the number calculated from integers of the command line argument. In default, integers are added.

```

## Examples

### Calculate a sum

`sbt "run 2 3 4"` returns `9`

### Calculate a product

`sbt "run -m 2 3 4"` returns `24`

## License

GNU GPL version 3

## ChangeLogs

- version `1.0` : This program calculates a sum (in default) or a product of integers in the command line arguments.

## Author(s)

- hisakatha (hisakatha@users.noreply.github.com) (You can't send to this address.)
