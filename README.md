# StudentManagementSoftware
don't show your weaknesss

## Building SMS

### Supported Platforms
- Windows
- Linux


### Building from source

- requirements:
    - Windows
        - [gradle](https://gradle.org/install/)
        - [git](https://git-scm.com/downloads) _optional_

    - Linux
        - gradle
            - Arch linux
            ```sudo pacman -S gradle```
            - Debian, Ubuntu
            ```sudo apt-get install gradle```
            - Fedora
            ```sudo dnf install gradle```
        
        - git
            - Arch linux
            ```sudo pacman -S git```
            - Debian, Ubuntu
            ```sudo apt-get install git```
            - Fedora
            ```sudo dnf install git```

        
download the [zip](https://github.com/Geez14/StudentManagementSoftware/archive/refs/heads/development.zip)
unpack the zip
```
cd ./StudentManagementSoftware
gradle build
```

or

#### via git clone
```
git clone https://github.com/Geez14/StudentManagementSoftware.git
cd ./StudentManagementSoftware
gradle build
```

#### run the executable
```
gradle run
```