const asyncHandler = require("express-async-handler");
const Contact = require("../models/contactModel");

// @desc Get all contacts
// @route GET /contacts

const getAllContacts = asyncHandler(async (req, res) => {
  const contacts = await Contact.find();
  res.status(200).send(contacts);
});

// @desc Create a contact
// @route POST /contacts
const createContact = asyncHandler(async (req, res) => {
  console.log(req.body);
  const { name, email, phone } = req.body;
  if (!name || !email || !phone) {
    return res.status(400).send("필수값이 입력되지 않았습니다.");
  }
  const contact = await Contact.create({
    name,
    email,
    phone,
  });
  res.status(201).send("Create Contacts");
});

// @desc Get contact
// @route GET /contacts/:id
const getContact = asyncHandler(async (req, res) => {
  const contact = await Contact.findById(req.params.id);
  res.status(200).send(contact);
});

// @desc Update contact
// @route PUT /contacts/:id
const updateContact = asyncHandler(async (req, res) => {
  // res.status(200).send(`Update Contact for ID: ${req.params.id}`);
  const id = req.params.id;
  const { name, email, phone } = req.body;
  const contact = await Contact.findById(id);
  if (!contact) {
    res.status(404);
    throw new Error("Contact not found");
  }

  // 수정
  contact.name = name;
  contact.email = email;
  contact.phone = phone;

  // 저장
  contact.save();

  res.status(200).json(contact);
});


// @desc Delete contact
// @route DELETE /contacts/:id
const deleteContact = asyncHandler(async (req, res) => {
  const id = req.params.id;  // URL에서 ID 추출
  const contact = await Contact.findById(id);  // ID로 해당 연락처 찾기

  // 연락처가 존재하지 않으면 오류 발생
  if (!contact) {
    res.status(404);  // Not Found 상태코드 설정
    throw new Error("Contact not found");
  }

  // 찾은 연락처 삭제
  await Contact.deleteOne({ _id: id });

  // 성공 메시지 반환
  res.status(200).send(`Deleted Contact with ID: ${id}`);
});

module.exports = {
  getAllContacts,
  createContact,
  getContact,
  updateContact,
  deleteContact,
};