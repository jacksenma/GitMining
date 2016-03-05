import urllib2
url='http://www.gitmining.net/api/repository/'
url1='http://www.gitmining.net/api/user/'

def getInfoList(url='http://www.gitmining.net/api/repository/names'):
    req=urllib2.Request(url) 
    response=urllib2.urlopen(req)
    the_info=response.read()
    return(the_info)