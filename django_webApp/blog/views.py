# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.shortcuts import render
from django.http import HttpResponse


posts=[
    {
        'author':'J K Rowling',
        'title':'Harry Potter and the Secret book of Facts',
        'content':'First posted content',
        'date_posted':'October 11, 2019'
    },
    {
        'author':'Ralph Fowler',
        'title':'Imaginary non-sense about realistic things',
        'content':'First posted content',
        'date_posted':'July 11, 2019'
    }
]
# Create your views here.

def home(request):
    context={
    'posts':posts
    }
    return render(request,'blog/home.html',context)

def about(request):

    return render(request,'blog/about.html',{'title':'About'})
